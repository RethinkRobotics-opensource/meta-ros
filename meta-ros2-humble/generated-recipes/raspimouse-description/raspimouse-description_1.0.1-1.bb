# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The raspimouse_description package"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "Daisuke Sato <daisuke.sato@rt-net.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "raspimouse_description"
ROS_BPN = "raspimouse_description"

ROS_BUILD_DEPENDS = " \
    joint-state-publisher \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz2 \
    urdf \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-state-publisher \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz2 \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz2 \
    urdf \
    xacro \
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

# matches with: https://github.com/ros2-gbp/raspimouse_description-release/archive/release/humble/raspimouse_description/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/raspimouse_description"
SRC_URI = "git://github.com/ros2-gbp/raspimouse_description-release;${ROS_BRANCH};protocol=https"
SRCREV = "bd65a063b9ce5f16a205b94ee7430556901a7819"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
