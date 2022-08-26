# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Messages for cob_manipulation"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cob_manipulation"
ROS_BPN = "cob_manipulation_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    message-generation \
    moveit-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    moveit-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    moveit-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_manipulation-release/archive/release/noetic/cob_manipulation_msgs/0.7.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_manipulation_msgs"
SRC_URI = "git://github.com/ipa320/cob_manipulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "3ff8ea7670d316e336790aa4380c2928edcc80d8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
