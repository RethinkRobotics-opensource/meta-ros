# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "mapviz"
AUTHOR = "Southwest Research Institute <swri-robotics@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/mapviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mapviz"
ROS_BPN = "mapviz"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    freeglut \
    geometry-msgs \
    glew \
    image-transport \
    libxi \
    libxmu \
    mapviz-interfaces \
    marti-common-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-math-util \
    swri-transform-util \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    pkgconfig-native \
    qtbase-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    freeglut \
    geometry-msgs \
    glew \
    image-transport \
    libxi \
    libxmu \
    mapviz-interfaces \
    marti-common-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-math-util \
    swri-transform-util \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    freeglut \
    geometry-msgs \
    glew \
    image-transport \
    launch-xml \
    libxi \
    libxmu \
    mapviz-interfaces \
    marti-common-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    rqt-gui \
    rqt-gui-cpp \
    std-srvs \
    swri-math-util \
    swri-transform-util \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mapviz-release/archive/release/humble/mapviz/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/mapviz"
SRC_URI = "git://github.com/ros2-gbp/mapviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "90e1b4a522c2c24bd3b4036173aac9f70e31eecd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
