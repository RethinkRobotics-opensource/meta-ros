FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-removing-host-path-from-code-generation.patch \
    file://0001-Explicitly-setting-the-destination-path-in-pycache.patch \
"