package finaldemo

import np.com.pantbinod.Role
import np.com.pantbinod.User
import np.com.pantbinod.UserRole

class BootStrap {

    def init = { servletContext ->
        def superadminRole = Role.findByAuthority("ROLE_SUPERADMIN") ?:
                new Role(authority:"ROLE_SUPERADMIN").save(flush: true)

        def adminRole = Role.findByAuthority("ROLE_ADMIN") ?:
                new Role(authority:"ROLE_ADMIN").save(flush: true)


        def userRole = Role.findByAuthority("ROLE_USER") ?:
                new Role(authority: "ROLE_USER").save(flush: true)


        if(!User.findByUsername("superadmin")){
            def superadminUser= new User(username: "superadmin",password: "superadmin").save(flush: true)
            UserRole.create(superadminUser, superadminRole,true)
        }

        if(!User.findByUsername("admin")){
            def adminUser= new User(username: "admin",password: "admin").save(flush: true)
            UserRole.create(adminUser, adminRole,true)
        }
        if(!User.findByUsername("user")){
            def normalUser= new User(username: "user",password: "user").save(flush: true)
            UserRole.create(normalUser, userRole,true)
        }

    }
    def destroy = {
    }
}
