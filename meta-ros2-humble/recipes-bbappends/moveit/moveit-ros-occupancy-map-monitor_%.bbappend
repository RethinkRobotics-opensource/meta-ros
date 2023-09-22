
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-cmake-making-package-relocatable.patch \
"

# fixes qa [dev-so]
FILES:${PN}-dev += " \
    /usr/lib/libmoveit_ros_occupancy_map_monitor.so \
"