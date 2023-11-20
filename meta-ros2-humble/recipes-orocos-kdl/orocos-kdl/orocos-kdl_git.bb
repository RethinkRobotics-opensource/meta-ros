LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=a8ffd58e6eb29a955738b8fcc9e9e8f2 \
                    file://debian/copyright;md5=57b48fd56cf39965622e7d8a9ff2ed50"

SRC_URI = "gitsm://github.com/orocos/orocos_kinematics_dynamics.git;protocol=https;branch=master \
           file://0001-CMakeLists.txt-fixing-install-location-of-cmake.patch \
           file://0001-CMakeLists.txt-pkgconfig-fixing-include.patch \
           "

SRCREV = "b35de34ab6ca9cb9a776531f519d95d973f83d7f"

S = "${WORKDIR}/git/orocos_kdl"

DEPENDS = " \
    libeigen \
    boost \
"

inherit cmake

