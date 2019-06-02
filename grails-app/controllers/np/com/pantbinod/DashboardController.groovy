package np.com.pantbinod

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured
import np.com.pantbinod.statuslist.StatusList

@Secured("permitAll")
class DashboardController {

    def index() {
        println "called..................."
        if (isLoggedIn()) {

            if (SpringSecurityUtils.ifAnyGranted("ROLE_SUPERADMIN")) {
                render(view: 'superadminDashboard')
            } else if (SpringSecurityUtils.ifAnyGranted("ROLE_ADMIN")) {
                render view: 'adminDashboard'
            } else {
                render view: 'userDashboard'
            }

        } else {
            redirect(controller: 'login', action: 'auth')
        }

    }


    def ideaList() {

        if (isLoggedIn()) {

            if (SpringSecurityUtils.ifAnyGranted("ROLE_SUPERADMIN")) {
                render(view: 'superadminDashboard')
            } else if (SpringSecurityUtils.ifAnyGranted("ROLE_ADMIN")) {
                render view: 'adminDashboard'
            } else {
                render view: 'userDashboard'
            }


        } else {

            def idealist= HumanIdeas.createCriteria().list {

                eq("status",StatusList.PUBLISH.toString())
            }
            render(view:'/index', model: [idealist :idealist])
        }
    }

}