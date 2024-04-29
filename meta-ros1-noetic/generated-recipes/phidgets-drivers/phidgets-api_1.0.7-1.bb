# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/phidgets_api"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_api"

ROS_BUILD_DEPENDS = " \
    libphidget22 \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libphidget22 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libphidget22 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/noetic/phidgets_api/1.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/phidgets_api"
SRC_URI = "git://github.com/ros-drivers-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "21a78afea2789e9b83c86bc9852ae397267004a4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}