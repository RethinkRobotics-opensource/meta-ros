FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-fixing-TMPDIR-injections.patch \
"

# fix for QA Issue [dev-so]

FILES:${PN}-dev += " \
    /usr/lib/*.so \
"
