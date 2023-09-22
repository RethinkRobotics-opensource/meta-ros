# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Turtlebot4 Robot Bringup"
AUTHOR = "rkreinin <rkreinin@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot4_robot"
ROS_BPN = "turtlebot4_bringup"

ROS_BUILD_DEPENDS = " \
    depthai-bridge \
    depthai-examples \
    depthai-ros-driver \
    depthai-ros-msgs \
    joy-linux \
    nav2-common \
    rplidar-ros \
    teleop-twist-joy \
    tf2-ros \
    turtlebot4-description \
    turtlebot4-diagnostics \
    turtlebot4-node \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    depthai-bridge \
    depthai-examples \
    depthai-ros-driver \
    depthai-ros-msgs \
    joy-linux \
    nav2-common \
    rplidar-ros \
    teleop-twist-joy \
    tf2-ros \
    turtlebot4-description \
    turtlebot4-diagnostics \
    turtlebot4-node \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depthai-bridge \
    depthai-examples \
    depthai-ros-driver \
    depthai-ros-msgs \
    joy-linux \
    nav2-common \
    rplidar-ros \
    teleop-twist-joy \
    tf2-ros \
    turtlebot4-description \
    turtlebot4-diagnostics \
    turtlebot4-node \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/turtlebot4_robot-release/archive/release/humble/turtlebot4_bringup/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/turtlebot4_bringup"
SRC_URI = "git://github.com/ros2-gbp/turtlebot4_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "f0d3e73141495dafe39c1b086c50a12cdfcc50df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
