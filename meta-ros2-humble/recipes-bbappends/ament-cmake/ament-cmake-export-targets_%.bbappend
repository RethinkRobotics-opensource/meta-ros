FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Support-new-target-export-template-introduced-with-C.patch \
"
