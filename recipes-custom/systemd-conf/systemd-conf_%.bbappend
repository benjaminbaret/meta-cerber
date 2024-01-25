FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://01-eth.network \
"

FILES:${PN} += " \
    ${sysconfdir}/systemd/network/01-eth.network \
"   

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/01-eth.network ${D}${sysconfdir}/systemd/network
}