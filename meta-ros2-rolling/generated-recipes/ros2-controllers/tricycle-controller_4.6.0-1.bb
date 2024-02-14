# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Controller for a tricycle drive mobile base"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Tony Najjar <tony.najjar@logivations.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_controllers"
ROS_BPN = "tricycle_controller"

ROS_BUILD_DEPENDS = " \
    ackermann-msgs \
    backward-ros \
    builtin-interfaces \
    controller-interface \
    generate-parameter-library \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    rcpputils \
    realtime-tools \
    std-srvs \
    tf2 \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ackermann-msgs \
    backward-ros \
    builtin-interfaces \
    controller-interface \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    rcpputils \
    realtime-tools \
    std-srvs \
    tf2 \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ackermann-msgs \
    backward-ros \
    builtin-interfaces \
    controller-interface \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    rcpputils \
    realtime-tools \
    std-srvs \
    tf2 \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    controller-manager \
    hardware-interface-testing \
    ros2-control-test-assets \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_controllers-release/archive/release/rolling/tricycle_controller/4.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/tricycle_controller"
SRC_URI = "git://github.com/ros2-gbp/ros2_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "628bba039219853e383d9b6d4a8bc83811f7d726"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
