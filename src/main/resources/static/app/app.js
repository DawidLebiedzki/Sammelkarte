/**
 * Created by Dawid on 02.03.2017.
 */

var app = angular.module('myApp',  ['ngAnimate','ngSanitize', 'mgcrea.ngStrap']);

app.controller('MainCtrl', function($scope) {
});

'use strict';

angular.module('myApp')

    .config(function($datepickerProvider) {
        angular.extend($datepickerProvider.defaults, {
            dateFormat: 'dd/MM/yyyy',
            startWeek: 1
        });
    })

    .controller('DatepickerDemoCtrl', function($scope, $http) {

        $scope.selectedDate = new Date();
        $scope.selectedDateAsNumber = Date.UTC(1986, 1, 22);
        // $scope.fromDate = new Date();
        // $scope.untilDate = new Date();
        $scope.getType = function(key) {
            return Object.prototype.toString.call($scope[key]);
        };

        $scope.clearDates = function() {
            $scope.selectedDate = null;
        };

    })
    .config(function ($dropdownProvider) {
        angular.extend($dropdownProvider.defaults, {
            html: true
        });
    })

    .controller('DropdownDemoCtrl', function($scope, $alert) {

        $scope.dropdown = [
            {text: '<i class="fa fa-download"></i>&nbsp;Another action', href: '#anotherAction', active: true},
            {text: '<i class="fa fa-globe"></i>&nbsp;Display an alert', click: '$alert("Holy guacamole!")'},
            {text: '<i class="fa fa-external-link"></i>&nbsp;External link', href: '/auth/facebook', target: '_self'},
            {divider: true},
            {text: 'Separated link', href: '#separatedLink'}
        ];

        $scope.$alert = function (title) {
            $alert({
                title: title,
                content: 'Best check yo self, you\'re not looking too good.',
                placement: 'top',
                type: 'info',
                keyboard: true,
                show: true
            });
        };
    });