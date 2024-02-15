# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Tracing wrapper for ROS 2."
AUTHOR = "Christophe Bedard <bedard.christophe@gmail.com>"
ROS_AUTHOR = "Ingo Lütkebohle <ingo.luetkebohle@de.bosch.com>"
HOMEPAGE = "https://index.ros.org/p/tracetools/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros2_tracing"
ROS_BPN = "tracetools"

ROS_BUILD_DEPENDS = " \
    lttng-ust \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    lttng-ust \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lttng-tools \
    lttng-ust \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_tracing-release/archive/release/rolling/tracetools/8.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/tracetools"
SRC_URI = "git://github.com/ros2-gbp/ros2_tracing-release;${ROS_BRANCH};protocol=https"
SRCREV = "605f984d4ecf6c130432e4b66415071f262535a4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
