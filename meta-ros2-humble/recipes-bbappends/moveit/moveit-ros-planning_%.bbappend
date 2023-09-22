
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-cmake-making-package-relocatable.patch \
"

# fixing qa [dev-so]
FILES:${PN}-dev += " \
    ${libdir}/lib*.so \
"
