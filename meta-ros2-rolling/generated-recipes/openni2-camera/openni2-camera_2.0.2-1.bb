# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices. For using a kinect   with ROS, try the <a href="http://wiki.ros.org/freenect_stack">freenect stack</a>"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Julius Kammerl <jkammerl@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni2_camera"
ROS_BPN = "openni2_camera"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    builtin-interfaces \
    camera-info-manager \
    image-transport \
    pkgconfig \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    builtin-interfaces \
    camera-info-manager \
    image-transport \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    builtin-interfaces \
    camera-info-manager \
    depth-image-proc \
    image-transport \
    rclcpp \
    rclcpp-components \
    rosidl-default-runtime \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/openni2_camera-release/archive/release/rolling/openni2_camera/2.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/openni2_camera"
SRC_URI = "git://github.com/ros2-gbp/openni2_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "2105dbc6bd4288d328faef31ee38ab8ea19f4517"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
