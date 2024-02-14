# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "The fuse_graphs package provides some concrete implementations of the fuse_core::Graph interface."
AUTHOR = "Stephen Williams <swilliams@locusrobotics.com>"
ROS_AUTHOR = "Stephen Williams <swilliams@locusrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fuse"
ROS_BPN = "fuse_graphs"

ROS_BUILD_DEPENDS = " \
    ceres-solver \
    fuse-core \
    pluginlib \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ceres-solver \
    fuse-core \
    pluginlib \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    google-benchmark \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/fuse-release/archive/release/rolling/fuse_graphs/1.0.1-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/fuse_graphs"
SRC_URI = "git://github.com/ros2-gbp/fuse-release;${ROS_BRANCH};protocol=https"
SRCREV = "b51b8fd8c7588a6b3bc6ac57e4d79f74eccfcb50"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
