FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

# Patch upstreamed here:
# https://github.com/ros/genmsg/pull/103
SRC_URI:append = " \
    file://0001-pkg-genmsg.cmake-fix-location-of-pycache-obj.patch \
"


DEPENDS += "catkin"
