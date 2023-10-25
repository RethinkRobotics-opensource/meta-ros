FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-make-package-relocateable.patch \
"

DEPENDS:append = " \
    generate-parameter-library-py-native \
"

# fix for QA Issue [dev-so]

FILES:${PN}-dev += " \
    /usr/lib/*.so \
"