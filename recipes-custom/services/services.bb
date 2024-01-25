LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "cerber-client.service"

SRC_URI:append = " file://cerber-client.service "

do_install() {
    install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/cerber-client.service ${D}/${systemd_unitdir}/system
}

FILES:${PN} += "${systemd_unitdir}/system"