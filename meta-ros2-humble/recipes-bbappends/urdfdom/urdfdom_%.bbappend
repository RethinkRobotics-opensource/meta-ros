# Fixing a host contamination issue
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += " \
    file://0001-CMakeLists.txt-Some-fixes-for-Relocatable-package.patch \
"

# Fixing [dev-so] qa
FILES:${PN}-dev += " \
    ${libdir}/*.so \
    ${libdir}/urdfdom/cmake/*.cmake \
"