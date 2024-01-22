DESCRIPTION = "Cerber client"
SECTION = "Custom"

LICENSE = "CLOSED"


SRC_URI="file:///home/ben/OTA/Dev/cerber-client.zip"
S = "${WORKDIR}/cerber-client/src"

inherit cmake pkgconfig

DEPENDS += "glib-2.0 dbus curl json-glib"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 cerber-client ${D}${bindir}
}
