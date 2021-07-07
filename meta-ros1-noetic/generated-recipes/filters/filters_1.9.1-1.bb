# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This library provides a standardized interface for processing data as a sequence      of filters.  This package contains a base class upon which to build specific implementations     as well as an interface which dynamically loads filters based on runtime parameters."
AUTHOR = "Tully Foote <tfoote@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "filters"
ROS_BPN = "filters"

ROS_BUILD_DEPENDS = " \
    boost \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/filters-release/archive/release/noetic/filters/1.9.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/filters"
SRC_URI = "git://github.com/ros-gbp/filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a6753ee4116e4e73f5caf0dc978509605709492"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}