# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "RMF Building map tools"
AUTHOR = "Morgan Quigley <mquigley@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_traffic_editor"
ROS_BPN = "rmf_building_map_tools"

ROS_BUILD_DEPENDS = " \
    rmf-building-map-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-fuel-tools7} \
    ament-index-python \
    python3-fiona \
    python3-pyproj \
    python3-pyyaml \
    python3-requests \
    python3-rtree \
    python3-shapely \
    rclpy \
    rmf-building-map-msgs \
    rmf-site-map-msgs \
    sqlite3 \
    std-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_traffic_editor-release/archive/release/rolling/rmf_building_map_tools/1.8.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rmf_building_map_tools"
SRC_URI = "git://github.com/ros2-gbp/rmf_traffic_editor-release;${ROS_BRANCH};protocol=https"
SRCREV = "b63d43e855772f26b9e64aff06362ecb501dd77e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
