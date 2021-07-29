# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "turtlesim is a tool made for teaching ROS and ROS packages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://www.ros.org/wiki/turtlesim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_tutorials"
ROS_BPN = "turtlesim"

ROS_BUILD_DEPENDS = " \
    boost \
    geometry-msgs \
    message-generation \
    qtbase \
    rosconsole \
    roscpp \
    roscpp-serialization \
    roslib \
    rostime \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geometry-msgs \
    message-runtime \
    qtbase \
    rosconsole \
    roscpp \
    roscpp-serialization \
    roslib \
    rostime \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geometry-msgs \
    message-runtime \
    qtbase \
    rosconsole \
    roscpp \
    roscpp-serialization \
    roslib \
    rostime \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_tutorials-release/archive/release/noetic/turtlesim/0.10.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/turtlesim"
SRC_URI = "git://github.com/ros-gbp/ros_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "09a12fb73ea8160e10f7a0fb5ff55a56b1c7db55"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}