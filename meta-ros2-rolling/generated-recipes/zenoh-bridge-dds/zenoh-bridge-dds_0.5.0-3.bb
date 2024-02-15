# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Bridge between ROS2/DDS and Eclipse zenoh (https://zenoh.io). It allows the integration of zenoh applications with ROS2,     or the tunneling of ROS2 communications between nodes via the zenoh protocol at Internet scale."
AUTHOR = "ADLINK zenoh team <zenoh@adlink-labs.tech>"
HOMEPAGE = "https://github.com/eclipse-zenoh/zenoh-plugin-dds"
SECTION = "devel"
LICENSE = "EPL-2.0 & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=795d413315082484b70ff4d8370975a5"

ROS_CN = "zenoh_bridge_dds"
ROS_BPN = "zenoh_bridge_dds"

ROS_BUILD_DEPENDS = " \
    cargo \
    clang-native \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/zenoh_bridge_dds-release/archive/release/rolling/zenoh_bridge_dds/0.5.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/zenoh_bridge_dds"
SRC_URI = "git://github.com/ros2-gbp/zenoh_bridge_dds-release;${ROS_BRANCH};protocol=https"
SRCREV = "ef314e75ba427b5fa8149dd1c62bb6ee53684c93"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
