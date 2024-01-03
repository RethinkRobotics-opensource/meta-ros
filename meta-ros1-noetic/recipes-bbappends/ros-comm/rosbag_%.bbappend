FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-nanbield-fixes-for-newer-boost.patch \
"
