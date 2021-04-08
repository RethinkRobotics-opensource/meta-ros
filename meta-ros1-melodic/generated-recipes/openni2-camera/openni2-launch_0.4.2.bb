# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
AUTHOR = "Isaac I. Y. Saito <isaac.saito@plusonerobotics.com>"
ROS_AUTHOR = "Julius Kammerl <kammerl@willowgarage.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni2_camera"
ROS_BPN = "openni2_launch"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-catkin-pkg \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    openni2-camera \
    rgbd-launch \
    rospy \
    roswtf \
    tf \
    usbutils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depth-image-proc \
    image-proc \
    nodelet \
    openni2-camera \
    rgbd-launch \
    rospy \
    roswtf \
    tf \
    usbutils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/openni2_camera-release/archive/release/melodic/openni2_launch/0.4.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/openni2_launch"
SRC_URI = "git://github.com/ros-gbp/openni2_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "eb49cbfc5712e42156f489e9edb84c7b5cf8cddb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}