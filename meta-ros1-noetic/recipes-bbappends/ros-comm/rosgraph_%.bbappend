FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-rosgraph-update-code-from-Python-3.11.patch \
"