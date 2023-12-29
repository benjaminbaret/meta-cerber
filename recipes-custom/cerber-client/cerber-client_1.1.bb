DESCRIPTION = "Cerber client"
SECTION = "Custom"

LICENSE = "CLOSED"


SRC_URI="file:///home/ben/OTA/cerber-client.zip"

DEPENDS += " glib-2.0"  

S = "${WORKDIR}/cerber-client"

do_compile() {
	oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 "${S}/cerber-client" ${D}${bindir}
#	oe_runmake install 'DESTDIR=${D}'
}

FILES_${PN} += "${bindir}/cerber-client"


#do_install:append () {
#    install -d "${D}${bindir}"
#    install -m 0755 "${S}/cerber-client" ${D}${bindir}
#}


