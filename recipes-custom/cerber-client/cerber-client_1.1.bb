DESCRIPTION = "Cerber client"
SECTION = "Custom"

LICENSE = "CLOSED"


SRC_URI="file:///home/ben/OTA/cerber-client.zip"

DEPENDS += " glib-2.0"  

S = "${WORKDIR}/cerber-client"

CFLAGS += "-g -Wall -Werror -I/usr/include/dbus-1.0 -I/usr/lib/x86_64-linux-gnu/dbus-1.0/include -ldbus-1 -pthread -I/usr/include/libmount -I/usr/include/blkid -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -lgio-2.0 -lgobject-2.0 -lglib-2.0 -pthread -I/usr/include/gio-unix-2.0 -I/usr/include/libmount -I/usr/include/blkid -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -lgio-2.0 -lgobject-2.0 -lglib-2.0"
CFLAGS += "-Wl,-dynamic-linker,/lib/ld-linux-x86-64.so.2"

EXTRA_OEMAKE = "CFLAGS='${CFLAGS}'"

do_compile() {
	oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 "${S}/cerber-client" ${D}${bindir}
}

FILES_${PN} += "${bindir}/cerber-client"


