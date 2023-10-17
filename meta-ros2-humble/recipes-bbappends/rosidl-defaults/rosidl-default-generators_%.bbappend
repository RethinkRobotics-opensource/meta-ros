FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-add-python-imports-to-cmake.patch \
"

DEPENDS:append = " \
    python3-numpy \
"

RDEPENDS:${PN}:append = " \
    python3-numpy \
"