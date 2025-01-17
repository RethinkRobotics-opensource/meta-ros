# Copyright (c) 2020-2021 LG Electronics, Inc.

DESCRIPTION = "All non-test packages for the target from files/rolling/cache.yaml"
LICENSE = "MIT"

# ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_* variables are MACHINE specific
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup
inherit ros_distro_humble

PACKAGES = "${PN}"

RDEPENDS:${PN} = "${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES}"

# Contains only dev, dbg and staticdev files, so PN is empty and not created
RDEPENDS:${PN}:remove = "test-osrf-testing-tools-cpp"

# It's empty package now, just providing dependency on platform zstd recipe
RDEPENDS:${PN}:remove = "zstd-vendor"

# It's empty package now, just providing dependency on platform python3-pybind11 recipe
RDEPENDS:${PN}:remove = "pybind11-vendor"

# Depends on unavailable python3-shapely
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'python3-shapely', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON3_SHAPELY}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON3_SHAPELY = " \
    rmf-demos-maps \
    rmf-building-map-tools \
    rmf-traffic-editor-test-maps \
"
# Depends on unavailable python3-flask-cors
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'python3-flask-cors', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON3_FLASK_CORS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYTHON3_FLASK_CORS = " \
    rmf-demos-panel \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'rqt-runtime-monitor', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_RQT_RUNTIME_MONITOR}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_RQT_RUNTIME_MONITOR = " \
    rqt-runtime-monitor \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'mongodb', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB = " \
    run-ompl-constrained-planning \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'mongodb-legacy-cxx-driver', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB_LEGACY_CXX_DRIVER}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_MONGODB_LEGACY_CXX_DRIVER = " \
    run-ompl-constrained-planning \
    warehouse-ros-mongo \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'cwiid', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CWIID}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CWIID = " \
    wiimote \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'libspnav', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBSPNAV}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBSPNAV = " \
    spacenav \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'cargo', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CARGO}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CARGO = " \
    zenoh-bridge-dds \
"

# alternative not yet supported implementation for fastrtps
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'connext', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CONNEXT}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CONNEXT = " \
    connext-cmake-module \
    rmw-connext-cpp \
    rmw-connext-shared-cpp \
    rmw-connextdds-common \
    rmw-connextdds \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
    rti-connext-dds-cmake-module \
"

# alternative not yet supported implementation for fastrtps
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gurumdds', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GURUMDDS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GURUMDDS = " \
    gurumdds-cmake-module \
    rmw-gurumdds-cpp \
    rmw-gurumdds-shared-cpp \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'libomp', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBOMP}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBOMP = " \
    moveit-planners-ompl \
    moveit-planners \
    moveit-ros \
    moveit-ros-perception \
    moveit-runtime \
    moveit-setup-core-plugins \
    moveit-hybrid-planning \
"

# Can't build these until we figure out how to build clang-format, clang-tidy without building all of clang.
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'clang', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CLANG}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_CLANG = " \
    ament-clang-format \
    ament-clang-tidy \
    ament-cmake-clang-format \
    ament-cmake-clang-tidy \
    ouxt-lint-common \
    pinocchio \
    zenoh-bridge-dds \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'openni', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENNI}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENNI = " \
    rtabmap \
"

# Needs work to launch qemu to run tests on image on build machine.
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'launch', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LAUNCH}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LAUNCH = " \
    launch-testing-ament-cmake \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'sdformat', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SDFORMAT}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SDFORMAT = " \
    sdformat-urdf \
"

# not compatible with glibc-2.34 without easy fix as reported in https://github.com/ros2/demos/issues/530
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'pendulum-control', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PENDULUM_CONTROL}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PENDULUM_CONTROL = " \
    desktop \
    desktop-full \
    pendulum-control \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'coinor-libipopt', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_COINOR_LIBIPOPT}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_COINOR_LIBIPOPT = " \
    control-box-rst \
    popf \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'libqglviewer', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBQGLVIEWER}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LIBQGLVIEWER = " \
    octovis \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'ignition', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_IGNITION}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_IGNITION = " \
    dolly-ignition \
    dolly \
    ign-rviz \
    ign-rviz-common \
    ign-rviz-plugins \
    ignition-cmake2-vendor \
    ignition-math6-vendor \
    ros-ign \
    ros-ign-bridge \
    ros-ign-gazebo \
    ros-ign-gazebo-demos \
    ros-ign-image \
    simulation \
"

# Depends on mesa or libglu which requires opengl or vulkan DISTRO_FEATURE
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'opengl', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_OPENGL = " \
    cartographer-rviz \
    color-names \
    desktop \
    desktop-full \
    dolly-gazebo \
    dolly \
    libg2o \
    librealsense2 \
    nav2-bringup \
    nav2-rviz-plugins \
    nmea-hardware-interface \
    moveit-setup-assistant \
    moveit-resources-prbt-moveit-config \
    moveit-ros \
    moveit-ros-perception \
    moveit-ros-visualization \
    moveit-runtime \
    moveit-visual-tools \
    moveit-setup-framework \
    moveit-setup-controllers \
    moveit \
    octomap-rviz-plugins \
    plotjuggler-ros \
    plotjuggler \
    realsense-examples \
    realsense-node \
    realsense-ros \
    rmf-visualization \
    rmf-visualization-rviz2-plugins \
    rtabmap \
    run-move-group \
    run-moveit-cpp \
    rviz-common \
    rviz-default-plugins \
    rviz-imu-plugin \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-visual-tools \
    rviz2 \
    slam-toolbox \
    snowbot-operating-system \
    turtlebot3 \
    turtlebot3-navigation2 \
    turtlebot3-bringup \
    turtlebot3-gazebo \
    turtlebot3-simulations \
    ur \
    ur-bringup \
    ur-calibration \
    ur-description \
    ur-moveit-config \
    ur-robot-driver \
    urdf-tutorial \
    webots-ros2-epuck \
    webots-ros2-tiago \
    webots-ros2-universal-robot \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT5}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_META_QT5 = " \
    cartographer-rviz \
    color-names \
    desktop \
    dolly \
    dolly-gazebo \
    imu-tools \
    joint-state-publisher-gui \
    leo-desktop \
    leo-viz \
    microstrain-inertial-rqt \
    moveit \
    moveit-resources \
    moveit-resources-panda-moveit-config \
    moveit-resources-prbt-moveit-config \
    moveit-ros \
    moveit-ros-visualization \
    moveit-runtime \
    moveit-setup-app-plugins \
    moveit-setup-assistant \
    moveit-setup-controllers \
    moveit-setup-framework \
    moveit-setup-srdf-plugins \
    moveit-visual-tools \
    nav2-bringup \
    nav2-rviz-plugins \
    navigation2 \
    nmea-hardware-interface \
    octomap-rviz-plugins \
    plansys2-bringup \
    plansys2-bt-actions \
    plansys2-executor \
    plansys2-planner \
    plansys2-problem-expert \
    plansys2-terminal \
    plansys2-tools \
    plotjuggler \
    plotjuggler-ros \
    python-qt-binding \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-core \
    qt-gui-cpp \
    qt-gui-py-common \
    rmf-building-sim-gazebo-plugins \
    rmf-building-sim-ignition-plugins \
    rmf-demos \
    rmf-demos-assets \
    rmf-demos-gz \
    rmf-demos-ign \
    rmf-robot-sim-gazebo-plugins \
    rmf-robot-sim-ignition-plugins \
    rmf-traffic-editor \
    rmf-visualization \
    rmf-visualization-rviz2-plugins \
    ros-image-to-qimage \
    rqt \
    rqt-action \
    rqt-bag \
    rqt-bag-plugins \
    rqt-common-plugins \
    rqt-console \
    rqt-graph \
    rqt-gui \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-image-overlay \
    rqt-image-overlay-layer \
    rqt-image-view \
    rqt-joint-trajectory-controller \
    rqt-moveit \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-reconfigure \
    rqt-robot-dashboard \
    rqt-robot-monitor \
    rqt-robot-steering \
    rqt-runtime-monitor \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-tf-tree \
    rqt-top \
    rqt-topic \
    run-move-group \
    run-moveit-cpp \
    rviz-common \
    rviz-default-plugins \
    rviz-imu-plugin \
    rviz-rendering \
    rviz-rendering-tests \
    rviz-visual-testing-framework \
    rviz-visual-tools \
    rviz2 \
    slam-toolbox \
    slider-publisher \
    snowbot-operating-system \
    turtle-tf2-cpp \
    turtle-tf2-py \
    turtlebot3 \
    turtlebot3-bringup \
    turtlebot3-gazebo \
    turtlebot3-navigation2 \
    turtlebot3-simulations \
    turtlesim \
    ur \
    ur-bringup \
    ur-calibration \
    ur-description \
    ur-moveit-config \
    ur-robot-driver \
    urdf-tutorial \
    webots-ros2-epuck \
    webots-ros2-tiago \
    webots-ros2-universal-robot \
"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_ACCEPTED contains "commercial" or "commercial_ffmpeg" or "ffmpeg".
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'ffmpeg', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_FFMPEG = " \
    mrpt2 \
    pose-cov-ops \
    usb-cam \
"

# OE won't let us build x264 unless LICENSE_FLAGS_ACCEPTED contains "commercial" or "commercial_x264" or "x264".
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'x264', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X264}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X264 = " \
    mrpt2 \
    pose-cov-ops \
    usb-cam \
"

# Recipes which need widgets enabled in qtbase PACKAGECONFIG which webOS OSE explicitly disables:
# meta-webos/recipes-qt/qt5/qtbase_git.bbappend:PACKAGECONFIG:remove = "widgets"
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt5-widgets', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_QT5_WIDGETS}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_QT5_WIDGETS = " \
    plotjuggler-ros \
    plotjuggler \
    rmf-traffic-editor \
    turtle-tf2-py \
    turtle-tf2-cpp \
    turtlesim \
"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'gazebo', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GAZEBO = " \
    aws-robomaker-small-warehouse-world \
    dolly-gazebo \
    dolly \
    gazebo-plugins \
    gazebo-ros2-control \
    gazebo-ros2-control-demos \
    gazebo-ros-pkgs \
    gazebo-ros \
    gazebo-rosdev \
    nav2-system-tests \
    rmf-demos \
    rmf-demos-assets \
    rmf-demos-gz \
    rmf-demos-ign \
    rmf-building-sim-gazebo-plugins \
    rmf-robot-sim-gazebo-plugins \
    turtlebot3-gazebo \
    turtlebot3-simulations \
    velodyne-description \
    velodyne-gazebo-plugins \
    velodyne-simulator \
"

ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API:x86 = ""
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API:x86-64 = ""
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API:armv7a = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', 'rc-genicam-api rc-genicam-driver', '', d)}"
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API:armv7ve = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', 'rc-genicam-api rc-genicam-driver', '', d)}"
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API:aarch64 = ""
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API = "\
    rc-genicam-api \
    rc-genicam-driver \
"

ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_WEBOTS_ROS2_DRIVER:x86-64 = ""
ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_WEBOTS_ROS2_DRIVER = "\
    webots-ros2-control \
    webots-ros2-driver \
    webots-ros2-tests \
"

ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC = " \
    ${ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_RC_GENICAM_API} \
    ${ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC_WEBOTS_ROS2_DRIVER} \
"

RDEPENDS:${PN}:remove = "${ROS_SUPERFLORE_GENERATED_ARCH_SPECIFIC}"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'pyqt5', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYQT5}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_PYQT5 = " \
    desktop \
    desktop-full \
    leo-desktop \
    leo-viz \
    joint-state-publisher-gui \
    moveit-resources \
    moveit-resources-panda-moveit-config \
    plansys2-tools \
    python-qt-binding \
    qt-dotgraph \
    qt-gui-app \
    qt-gui-core \
    qt-gui-cpp \
    qt-gui-py-common \
    qt-gui \
    rosmon \
    rqt-action \
    rqt-bag \
    rqt-bag-plugins \
    rqt-console \
    rqt-common-plugins \
    rqt-graph \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-gui \
    rqt-image-view \
    rqt-joint-trajectory-controller \
    rqt-moveit \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-reconfigure \
    rqt-robot-dashboard \
    rqt-robot-monitor \
    rqt-robot-steering \
    rqt-runtime-monitor \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-tf-tree \
    rqt-topic \
    rqt-top \
    rqt \
    slider-publisher \
    run-move-group \
    run-moveit-cpp \
"

# do_compile failures
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'qt-gui-cpp', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_QT_GUI_CPP}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_QT_GUI_CPP = " \
    qt-gui-core \
    qt-gui-cpp \
    rosmon \
    rqt-gui-cpp \
    rqt \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'self-test', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SELF_TEST}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SELF_TEST = " \
    self-test \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'x11', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X11}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_X11 = " \
    desktop \
    dolly-gazebo \
    dolly \
    libg2o \
    nav2-bringup \
    moveit-ros \
    moveit-ros-perception \
    moveit-ros-visualization \
    moveit-runtime \
    moveit-visual-tools \
    moveit \
    mrpt2 \
    pose-cov-ops \
    rmf-visualization \
    rmf-visualization-rviz2-plugins \
    rtabmap \
    run-move-group \
    run-moveit-cpp \
    rviz2 \
    rviz-common \
    rviz-default-plugins \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-visual-tools \
    snowbot-operating-system \
    turtlebot3-navigation2 \
    turtlebot3-gazebo \
    turtlebot3-simulations \
    webots-ros2-epuck \
    webots-ros2-tiago \
    webots-ros2-universal-robot \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'glfw', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GLFW}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_GLFW = " \
    librealsense2 \
    realsense-examples \
    realsense-node \
    realsense-ros \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'ros1', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_ROS1}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_ROS1 = " \
    rosbag2-bag-v2-plugins \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'babeltrace-python', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_BABELTRACE_PYTHON}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_BABELTRACE_PYTHON = " \
    ros2trace-analysis \
    tracetools-analysis \
    tracetools-read \
    tracetools-test \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'webots-python-modules', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WEBOTS_PYTHON_MODULES}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_WEBOTS_PYTHON_MODULES = " \
    webots-ros2 \
    webots-ros2-abb \
    webots-ros2-demos \
    webots-ros2-desktop \
    webots-ros2-core \
    webots-ros2-examples \
    webots-ros2-importer \
    webots-ros2-mavic \
    webots-ros2-tesla \
    webots-ros2-turtlebot \
    webots-ros2-tutorials \
"

RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'swri', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SWRI}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_SWRI = " \
    novatel-gps-driver \
    swri-image-util \
    swri-roscpp \
    swri-route-util \
    swri-transform-util \
"

# do_configure failures
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lanelet2-traffic-rules', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_TRAFFIC_RULES}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_TRAFFIC_RULES = " \
    lanelet2-examples \
    lanelet2-python \
    lanelet2-routing \
    lanelet2-traffic-rules \
    lanelet2-validation \
    lanelet2 \
"
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lanelet2-io', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_IO}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_IO = " \
    lanelet2-io \
    lanelet2-projection \
"
# do_compile failures
RDEPENDS:${PN}:remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lanelet2-core', '${ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_CORE}', '', d)}"
ROS_SUPERFLORE_GENERATED_WORLD_PACKAGES_DEPENDING_ON_LANELET2_CORE = " \
    lanelet2-core \
    lanelet2-maps \
"

# ROS_UNRESOLVED_DEP-ocl-icd-opencl-dev
RDEPENDS:${PN}:remove = " \
    vitis-common \
"

# ROS_UNRESOLVED_DEP-python3-scp
RDEPENDS:${PN}:remove = " \
    fogros2 \
"

# ROS_UNRESOLVED_DEP-libopen3d-dev
RDEPENDS:${PN}:remove = " \
    open3d-conversions \
"

# ROS_UNRESOLVED_DEP-python3-construct
RDEPENDS:${PN}:remove = " \
    splsm-7-conversion \
    rcgcd-spl-14-conversion \
    rcgcrd-spl-4-conversion \
    gc-spl-2022 \
    r2r-spl-7 \
"

# ROS_UNRESOLVED_DEP-opende
# ROS_UNRESOLVED_DEP-python3-whichcraft
RDEPENDS:${PN}:remove = " \
    ompl \
    nav2-smac-planner \
"

# ROS_UNRESOLVED_DEP-wireguard
RDEPENDS:${PN}:remove = " \
    fogros2-examples \
"

# ROS_UNRESOLVED_DEP-coinor-libcoinutils-dev
RDEPENDS:${PN}:remove = " \
    popf \
    plansys2-popf-plan-solver \
    plansys2-domain-expert \
"

# does not build because of incompatible version rmf-traffic-msgs
RDEPENDS:${PN}:remove = " \
    rmf-traffic-ros2 \
    rmf-fleet-adapter \
    rmf-task-ros2 \
    rmf-visualization-schedule \
    rmf-fleet-adapter-python \
"

# delayed until I have the time to get all the dependencies
RDEPENDS:${PN}:remove = " \
    depthai \
    depthai-examples \
    depthai-bridge \
    depthai-ros \
"

# delayed because could not find genicamConfig origin quickly
RDEPENDS:${PN}:remove = " \
    rc-genicam-api \
    rc-genicam-driver \
"

# delayed because honister has newer gpsd package as it seems
RDEPENDS:${PN}:remove = " \
    gps-umd \
    gpsd-client \
"

# broken CMake, aint nobody got time for this
RDEPENDS:${PN}:remove = " \
    foxglove-msgs \
"
