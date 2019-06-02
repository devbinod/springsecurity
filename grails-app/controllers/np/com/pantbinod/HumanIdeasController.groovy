package np.com.pantbinod

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import np.com.pantbinod.statuslist.StatusList

@Secured("permitAll")
class HumanIdeasController {

    HumanIdeasService humanIdeasService
    def mailService

    @Secured('ROLE_ADMIN')
    def publish(){
        def humanIdeas = HumanIdeas.findById(params.long('id'))
        humanIdeas.status = StatusList.PUBLISH.toString()
        humanIdeas.save(flush: true)
        redirect(action: 'index')

    }

    @Secured(['ROLE_SUPERADMIN','ROLE_ADMIN','ROLE_USER'])
    def index(Integer max) {

        def ideaList = HumanIdeas.createCriteria().list {


        }

        [ideaList: ideaList]

    }

    @Secured(['ROLE_SUPERADMIN','ROLE_ADMIN','ROLE_USER'])
    def show(Long id) {
        respond humanIdeasService.get(id)
    }

    @Secured("ROLE_SUPERADMIN")
    def create() {
        respond new HumanIdeas(params)
    }

    def save() {

        def humanIdeas = new HumanIdeas()
        humanIdeas.properties = params
        humanIdeas.save(flush: true)
        redirect(action: 'index')
    }

    def edit(Long id) {
        respond humanIdeasService.get(id)
    }

    def update(HumanIdeas humanIdeas) {
        if (humanIdeas == null) {
            notFound()
            return
        }

        try {
            humanIdeasService.save(humanIdeas)
        } catch (ValidationException e) {
            respond humanIdeas.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'humanIdeas.label', default: 'HumanIdeas'), humanIdeas.id])
                redirect humanIdeas
            }
            '*'{ respond humanIdeas, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        humanIdeasService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'humanIdeas.label', default: 'HumanIdeas'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'humanIdeas.label', default: 'HumanIdeas'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }


    @Secured("permitAll")
    def sendMainToUser(){
        mailService.sendMail {
            to "fuzirik@eaglemail.top"
            from "binodpant.nep@gmail.com"
            subject "Hello Mail"
            text 'this is some text'
        }
        redirect(action: 'index')
    }

}
