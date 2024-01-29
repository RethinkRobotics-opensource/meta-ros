FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " \
    file://0001-remove-insane-string-replace.patch \
"

EXTRA_OECMAKE += " \
    -DOMPL_BUILD_DEMOS=OFF \
    -DOMPL_REGISTRATION=OFF \
"

inherit ros_ament_cmake

do_install:append() {
    rm -Rf ${D}${datadir}/ompl/demos
}

INSANE_SKIP:${PN} += "dev-so"
