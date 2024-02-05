FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-random-fixes-to-remove-TMPDIR-from-so.patch \
"