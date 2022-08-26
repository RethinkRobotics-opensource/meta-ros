# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Serial is a cross-platform, simple to use library for using serial ports on computers.  This library provides a C++, object oriented interface for interacting with RS-232 like devices on Linux and Windows."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "William Woodall <wjwwood@gmail.com>"
HOMEPAGE = "http://wjwwood.github.com/serial/"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "serial"
ROS_BPN = "serial"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    boost \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/wjwwood/serial-release/archive/release/noetic/serial/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/serial"
SRC_URI = "git://github.com/wjwwood/serial-release;${ROS_BRANCH};protocol=https"
SRCREV = "edd5de7001c282db38e570ddeb9d3629d493c8e7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
