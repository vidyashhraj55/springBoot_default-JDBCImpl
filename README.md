# springboot_security2
spring boot security example with mysql DB.


In the ItemController:

The first is that when using hasRole('ADMIN') that first a check is done if it starts with the role prefix (for which the default is ROLE_) if not the passed in role is prefix with it . So in this case the actual authority checked is ROLE_ADMIN and not ADMIN.

However in your JDBC option you have authorities ADMIN and hence the hasRole('ADMIN') check fails because ROLE_ADMIN isn't equal to ADMIN.
Instead of hasRole use hasAuthority the latter doesn't add the role prefix and for the in memory option use authorities instead of roles.

In the JDBC option prefix the authorities in the database with ROLE_

