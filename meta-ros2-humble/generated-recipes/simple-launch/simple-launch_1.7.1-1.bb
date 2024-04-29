# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Python helper class for the ROS 2 launch system"
AUTHOR = "Olivier Kermorgant <olivier.kermorgant@ec-nantes.fr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "simple_launch"
ROS_BPN = "simple_launch"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/simple_launch-release/archive/release/humble/simple_launch/1.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/simple_launch"
SRC_URI = "git://github.com/ros2-gbp/simple_launch-release;${ROS_BRANCH};protocol=https"
SRCREV = "6b722ad2afd672c8a953759c6a90f33b47d8c0fa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}