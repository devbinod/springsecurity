package np.com.pantbinod.statuslist

enum StatusList {


        TRASH("TRASH"),
        PUBLISH("PUBLISH"),
        DRAFT("DRAFT")

    String value

    StatusList(String value) {
        this.value = value
    }

    String getValue(){
        return this.value
    }
}
