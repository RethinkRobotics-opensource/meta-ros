FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-fixing-relocatable-package-issue.patch \
"