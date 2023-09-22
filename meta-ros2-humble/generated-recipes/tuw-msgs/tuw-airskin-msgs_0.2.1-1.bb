# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The tuw_airskin_msgs package"
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
ROS_AUTHOR = "Klaus Buchegger <klaus.buchegger@tuwien.ac.at>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tuw_msgs"
ROS_BPN = "tuw_airskin_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tuw-robotics/tuw_msgs-release/archive/release/humble/tuw_airskin_msgs/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/tuw_airskin_msgs"
SRC_URI = "git://github.com/tuw-robotics/tuw_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "65bcb66d8bedd23137744e2796ed47f592fd0932"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
