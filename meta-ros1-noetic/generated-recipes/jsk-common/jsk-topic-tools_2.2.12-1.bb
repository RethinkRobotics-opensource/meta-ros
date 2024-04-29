# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "jsk_topic_tools"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/jsk_topic_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_topic_tools"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    dynamic-tf-publisher \
    eigen-conversions \
    geometry-msgs \
    image-transport \
    message-generation \
    nodelet \
    roscpp \
    roslaunch \
    rosnode \
    rostest \
    rostime \
    rostopic \
    std-msgs \
    std-srvs \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-iputils-ping} \
    ${ROS_UNRESOLVED_DEP-python3-scipy} \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    dynamic-tf-publisher \
    eigen-conversions \
    geometry-msgs \
    image-transport \
    message-runtime \
    nodelet \
    opencv \
    python3-numpy \
    roscpp \
    roslaunch \
    rosnode \
    rostime \
    rostopic \
    sensor-msgs \
    sound-play \
    std-msgs \
    std-srvs \
    tf \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roscpp-tutorials \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_common-release/archive/release/noetic/jsk_topic_tools/2.2.12-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/jsk_topic_tools"
SRC_URI = "git://github.com/tork-a/jsk_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "bfc1425941b26cad4774d8ab9a248a03ba67a48f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}