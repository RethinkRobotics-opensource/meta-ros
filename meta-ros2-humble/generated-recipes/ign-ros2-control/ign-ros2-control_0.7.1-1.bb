# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Ignition ros2_control package allows to control simulated robots using ros2_control framework."
AUTHOR = "Alejandro Hernández <alejandro@openrobotics.com>"
ROS_AUTHOR = "Alejandro Hernández"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "ign_ros2_control"
ROS_BPN = "ign_ros2_control"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gazebo6} \
    ${ROS_UNRESOLVED_DEP-ignition-plugin} \
    ament-index-cpp \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gazebo6} \
    ${ROS_UNRESOLVED_DEP-ignition-plugin} \
    ament-index-cpp \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gazebo6} \
    ${ROS_UNRESOLVED_DEP-ignition-plugin} \
    ament-index-cpp \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    yaml-cpp-vendor \
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

# matches with: https://github.com/ros2-gbp/ign_ros2_control-release/archive/release/humble/ign_ros2_control/0.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/ign_ros2_control"
SRC_URI = "git://github.com/ros2-gbp/ign_ros2_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "eded0d14e8bf40982c40ddb14aedb4d50d5e4b5b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
