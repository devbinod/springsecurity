package np.com.pantbinod

import np.com.pantbinod.statuslist.StatusList

class HumanIdeas {


    String title
    String idea
    String status = StatusList.DRAFT.toString()

    static constraints = {
    }
}
