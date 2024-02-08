FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " \
    file://0001-remove-insane-string-replace.patch \
    file://0001-CMakeLists.txt-using-targets-to-avoid-TMPDIR-leak.patch \
"

EXTRA_OECMAKE += " \
    -DOMPL_BUILD_DEMOS=OFF \
    -DOMPL_REGISTRATION=OFF \
"

inherit ros_ament_cmake

do_install:append() {
    rm -Rf ${D}${datadir}/ompl/demos
}

# fix dev-so qa
FILES:${PN}-dev += " \
    /usr/lib/libompl.so \
"