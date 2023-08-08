LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://../orocos_kdl/COPYING;md5=a8ffd58e6eb29a955738b8fcc9e9e8f2 \
                    file://../orocos_kdl/debian/copyright;md5=57b48fd56cf39965622e7d8a9ff2ed50"

SRC_URI = "git://github.com/orocos/orocos_kinematics_dynamics.git;protocol=https;branch=master \
           "

SRCREV = "b35de34ab6ca9cb9a776531f519d95d973f83d7f"

S = "${WORKDIR}/git/python_orocos_kdl"

DEPENDS = " \
    orocos-kdl \
    python3-pybind11-native \
"

FILES:${PN} += " \
    /usr/lib/python3.11/dist-packages/PyKDL.so \
"

inherit cmake python3native

