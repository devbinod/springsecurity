package np.com.pantbinod

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HumanIdeasServiceSpec extends Specification {

    HumanIdeasService humanIdeasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new HumanIdeas(...).save(flush: true, failOnError: true)
        //new HumanIdeas(...).save(flush: true, failOnError: true)
        //HumanIdeas humanIdeas = new HumanIdeas(...).save(flush: true, failOnError: true)
        //new HumanIdeas(...).save(flush: true, failOnError: true)
        //new HumanIdeas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //humanIdeas.id
    }

    void "test get"() {
        setupData()

        expect:
        humanIdeasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<HumanIdeas> humanIdeasList = humanIdeasService.list(max: 2, offset: 2)

        then:
        humanIdeasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        humanIdeasService.count() == 5
    }

    void "test delete"() {
        Long humanIdeasId = setupData()

        expect:
        humanIdeasService.count() == 5

        when:
        humanIdeasService.delete(humanIdeasId)
        sessionFactory.currentSession.flush()

        then:
        humanIdeasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        HumanIdeas humanIdeas = new HumanIdeas()
        humanIdeasService.save(humanIdeas)

        then:
        humanIdeas.id != null
    }
}
