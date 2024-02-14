# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ros2 hardware interface for nmea_gps"
AUTHOR = "kenta <kenntabsk@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "apache 2.0"
LICENSE = "apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=ff39ea40528331bfabfebc1c6d0df20e"

ROS_CN = "nmea_hardware_interface"
ROS_BPN = "nmea_hardware_interface"

ROS_BUILD_DEPENDS = " \
    boost \
    controller-interface \
    geographic-msgs \
    gtk+3 \
    hardware-interface \
    nmea-msgs \
    pkgconfig \
    pluginlib \
    quaternion-operation \
    rclcpp \
    rclcpp-components \
    realtime-tools \
    ros2-control \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    controller-interface \
    geographic-msgs \
    gtk+3 \
    hardware-interface \
    nmea-msgs \
    pkgconfig \
    pluginlib \
    quaternion-operation \
    rclcpp \
    rclcpp-components \
    realtime-tools \
    ros2-control \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    controller-interface \
    geographic-msgs \
    gtk+3 \
    hardware-interface \
    nmea-msgs \
    pkgconfig \
    pluginlib \
    quaternion-operation \
    rclcpp \
    rclcpp-components \
    realtime-tools \
    ros2-control \
    rviz2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ouxt-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nmea_hardware_interface-release/archive/release/rolling/nmea_hardware_interface/0.0.1-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/nmea_hardware_interface"
SRC_URI = "git://github.com/ros2-gbp/nmea_hardware_interface-release;${ROS_BRANCH};protocol=https"
SRCREV = "45643346f9904eeb045fea14dd7e3eea1a5a91f7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
