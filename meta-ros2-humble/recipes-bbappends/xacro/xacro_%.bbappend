FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-xacro-fix-bug-with-wrong-shebang-replacement.patch \
"
