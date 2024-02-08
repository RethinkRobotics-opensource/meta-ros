DEPENDS:append = " moveit-ros-planning "

RDEPENDS:${PN} += " bash "

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-fix-TMPDIR-injections-and-.so-version.patch \
"

# fix for QA Issue [dev-so]

FILES:${PN}-dev += " \
    /usr/lib/*.so \
"