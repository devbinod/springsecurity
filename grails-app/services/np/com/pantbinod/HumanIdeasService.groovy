package np.com.pantbinod

import grails.gorm.services.Service

@Service(HumanIdeas)
interface HumanIdeasService {

    HumanIdeas get(Serializable id)

    List<HumanIdeas> list(Map args)

    Long count()

    void delete(Serializable id)

    HumanIdeas save(HumanIdeas humanIdeas)

}