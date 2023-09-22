FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-making-package-relocatable.patch \
"

# fixes [dev-so] qa issue
FILES:${PN}-dev += " \
    /usr/lib/libgeometric_shapes.so \
"