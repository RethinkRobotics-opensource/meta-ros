FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Fixing-includes-with-GCC-13.2.patch \
"

ROS_BUILD_DEPENDS += " \
    python3-empy-native \
    rcutils-native \
"